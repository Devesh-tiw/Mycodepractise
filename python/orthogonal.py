import numpy as np

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