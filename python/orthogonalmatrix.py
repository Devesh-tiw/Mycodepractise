import numpy as np
import matplotlib.pyplot as plt

# 1. Create a messy matrix, then extract its Orthogonal "bones" (Q)
A = np.array([[12, -51,   4],
              [ 6, 167, -68],
              [-4,  24, -41]])

Q, R = np.linalg.qr(A)

# 2. Extract the orthogonal columns from Q
v1 = Q[:, 0]
v2 = Q[:, 1]
v3 = Q[:, 2]

# 3. Set up the 3D graph
fig = plt.figure(figsize=(8, 8))
ax = fig.add_subplot(111, projection='3d')

# 4. Draw the arrows! 
ax.quiver(0, 0, 0, v1[0], v1[1], v1[2], color='red', label='Orthogonal Col 1', arrow_length_ratio=0.1)
ax.quiver(0, 0, 0, v2[0], v2[1], v2[2], color='blue', label='Orthogonal Col 2', arrow_length_ratio=0.1)
ax.quiver(0, 0, 0, v3[0], v3[1], v3[2], color='green', label='Orthogonal Col 3', arrow_length_ratio=0.1)

# 5. Format the graph limits to a 1x1x1 box (since orthogonal vectors have length 1)
ax.set_xlim([-1, 1])
ax.set_ylim([-1, 1])
ax.set_zlim([-1, 1])

# CRITICAL: Force the 3D box to be a perfect cube so 90 degrees actually looks like 90 degrees!
ax.set_box_aspect([1, 1, 1])

ax.set_xlabel('X Axis')
ax.set_ylabel('Y Axis')
ax.set_zlabel('Z Axis')
plt.title("Visualizing an Orthogonal Matrix (Perfect 90° Angles)")
plt.legend()

# 6. Show the graph!
plt.show()