import numpy as np
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression

# 1. The Data (The "Messy Reality")
# X is our input matrix: Years of Experience
X = np.array([[1], [2], [3], [4], [5]]) 

# y is our output vector: Salary (in thousands of dollars)
y = np.array([45, 50, 60, 65, 75])

# 2. Build the AI Brain
# We are telling scikit-learn we want to use a Linear Regression model
model = LinearRegression()

# 3. Train the AI (The Matrix Math!)
# When you call .fit(), the computer uses all those matrix projections 
# we learned about to find the mathematically perfect line through the data.
model.fit(X, y)

# 4. Predict the Future!
# Let's ask the AI: "How much should someone with 6 years of experience make?"
future_X = np.array([[6]])
prediction = model.predict(future_X)

print(f"AI Prediction for 6 years experience: ${prediction[0]:.2f}k")

# ---------------------------------------------------------
# Let's visualize what the AI actually did!
# ---------------------------------------------------------

# Plot the original messy data points as blue dots
plt.scatter(X, y, color='blue', label='Real Data (Messy)')

# Plot the AI's perfect line of best fit in red
plt.plot(X, model.predict(X), color='red', label='AI Line of Best Fit')

# Plot our brand new prediction as a giant green dot
plt.scatter(future_X, prediction, color='green', s=100, label='Future Prediction')

# Format the graph
plt.title("AI Learning: Experience vs Salary")
plt.xlabel("Years of Experience")
plt.ylabel("Salary ($1000s)")
plt.legend()
plt.grid(True, linestyle='--', alpha=0.7)

# Show the graph!
plt.show()