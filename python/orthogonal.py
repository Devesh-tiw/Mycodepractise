import numpy as np
import matplotlib.pyplot as plt

# Create a 2D rotation matrix for 45 degrees
theta = np.radians(45)
Q = np.array([
    [np.cos(theta), -np.sin(theta)],
    [np.sin(theta),  np.cos(theta)]
])

# Calculate the Transpose
Q_t = Q.T

# Multiply Q_t by Q (should be the Identity Matrix)
identity_check = np.dot(Q_t, Q)

print("Orthogonal Matrix Q:\n", Q)
print("\nTranspose Q^T (which is also the Inverse):\n", Q_t)
print("\nResult of Q^T * Q:\n", np.round(identity_check))
plt.figure(figsize=(6, 6))
# Plot the original basis vectors
plt.quiver(0, 0, Q[0, 0], Q[1, 0], color='blue', label='First Basis Vector', angles='xy', scale_units='xy', scale=1)
plt.quiver(0, 0, Q[0, 1], Q[1, 1], color='orange', label='Second Basis Vector', angles='xy', scale_units='xy', scale=1)
plt.xlim(-1, 1.5)
plt.ylim(-1.5, 1)
plt.grid(True)
plt.axis('equal')
plt.title('Original Basis Vectors')
plt.xlabel('X')
plt.ylabel('Y')
plt.legend()
plt.show()