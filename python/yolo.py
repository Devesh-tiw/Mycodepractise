from ultralytics import YOLO
import cv2

# 1. Load the "Nano" version of YOLOv8 (it is small and runs fast on any laptop)
print("Loading the AI Brain...")
model = YOLO("yolov8n.pt") 

# 2. Open your computer's webcam
print("Opening the camera...")
cap = cv2.VideoCapture(0)

while True:
    # 3. Take a picture (frame) from the webcam
    success, frame = cap.read()
    
    if success:
        # 4. Give the picture to the AI so it can find the objects
        results = model(frame)
        
        # 5. Draw the boxes and labels on the picture
        annotated_frame = results[0].plot()
        
        # 6. Show the final picture on your screen!
        cv2.imshow("New Cam AI", annotated_frame)
        
        # Press the 'q' key on your keyboard to quit
        if cv2.waitKey(1) & 0xFF == ord('q'):
            break

# 7. Turn off the camera when done
cap.release()
cv2.destroyAllWindows()