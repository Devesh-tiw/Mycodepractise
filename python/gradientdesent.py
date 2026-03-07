# 1. Import the AI building blocks
from sklearn.linear_model import LinearRegression
import numpy as np

# 2. Provide the messy real-world data (X = inputs, y = outputs)
X = np.array([[1], [2], [3], [4]])  # e.g., Years of experience
y = np.array([50000, 90000, 50000, 90000])  # e.g., Salary

# 3. Create the "Brain" (The linear regression model)
model = LinearRegression()

# 4. Train the AI! (This runs Gradient Descent under the hood)
model.fit(X, y)

# 5. Make a prediction for the future
prediction = model.predict([[5]]) # Predict salary for 5 years of experience
print(f"Predicted Salary: {prediction[0]}")