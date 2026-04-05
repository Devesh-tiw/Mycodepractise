import numpy as np
import matplotlib.pyplot as plt
from PIL import Image
import requests
from io import BytesIO

def analyze_url_image(url, k_value):
    # 1. Fetch the image from the URL
    response = requests.get(url)
    img = Image.open(BytesIO(response.content)).convert('L') # Grayscale
    A = np.array(img)

    # 2. Perform SVD
    U, S, Vt = np.linalg.svd(A, full_matrices=False)

    # 3. Reconstruct at Rank k
    Ak = U[:, :k_value] @ np.diag(S[:k_value]) @ Vt[:k_value, :]

    # 4. Visualize the 'Math behind the curtain'
    fig, ax = plt.subplots(1, 2, figsize=(12, 5))
    ax[0].imshow(A, cmap='grey')
    ax[0].set_title("Original Image (The Matrix A)")
    
    ax[1].imshow(Ak, cmap='grey')
    ax[1].set_title(f"Reconstruction (Rank {k_value})")
    
    plt.show()

# The image you provided
url = "https://www.shutterstock.com/image-photo/sun-sets-behind-mountain-ranges-600nw-2479236003.jpg"
analyze_url_image(url, k_value=2)