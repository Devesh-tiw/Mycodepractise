import numpy as np
import matplotlib.pyplot as plt

# 1. Create a 3x3 matrix
# Let's use numbers that are easy to see in positive 3D space
A = np.array([[2, 0, 1],
              [3, 2, 1],
              [1, 1, 2]])

# 2. Extract the columns as individual 3D vectors
vector_1 = A[:, 0]  # The first column: [2, 0, 1]
vector_2 = A[:, 1]  # The second column: [0, 2, 1]
vector_3 = A[:, 2]  # The third column: [1, 1, 2]

# 3. Set up the 3D graph
fig = plt.figure(figsize=(8, 8))
ax = fig.add_subplot(111, projection='3d') # This turns on 3D mode!

# 4. Draw the arrows using ax.quiver
# In 3D, quiver needs starting coordinates (0,0,0) and ending directions (our vectors)
ax.quiver(0, 0, 0, vector_1[0], vector_1[1], vector_1[2], color='red', label='Col 1 (2,0,1)', arrow_length_ratio=0.1)
ax.quiver(0, 0, 0, vector_2[0], vector_2[1], vector_2[2], color='blue', label='Col 2 (0,2,1)', arrow_length_ratio=0.1)
ax.quiver(0, 0, 0, vector_3[0], vector_3[1], vector_3[2], color='green', label='Col 3 (1,1,2)', arrow_length_ratio=0.1)

# 5. Format the graph limits so we can see the arrows clearly.
ax.set_xlim([0, 3])
ax.set_ylim([0, 3])
ax.set_zlim([0, 3])

ax.set_xlabel('X Axis')
ax.set_ylabel('Y Axis')
ax.set_zlabel('Z Axis')
plt.title("Visualizing 3x3 Matrix Columns in 3D Space")
plt.legend()

# 6. Show the graph on your screen!
plt.show()