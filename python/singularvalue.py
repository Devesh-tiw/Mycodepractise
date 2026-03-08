import numpy as np
import matplotlib.pyplot as plt

# 1. Create a 100x100 "Image" Matrix (A cool ripple pattern)
x = np.linspace(-5, 5, 100)
X, Y = np.meshgrid(x, x)
A = np.sin(X**2 + Y**2) 

# 2. Run the SVD Algorithm!
U, Sigma, VT = np.linalg.svd(A)

# 3. Compress it! 
# Our matrix has 100 singular values. Let's ONLY keep the top 10!
k = 10
U_chopped = U[:, :k]
Sigma_chopped = np.diag(Sigma[:k])
VT_chopped = VT[:k, :]

# Rebuild the image using only the top 10% of the data
A_compressed = U_chopped @ Sigma_chopped @ VT_chopped

# ---------------------------------------------------------
# Plot them side-by-side to see the magic!
# ---------------------------------------------------------
fig, (ax1, ax2) = plt.subplots(1, 2, figsize=(10, 5))

ax1.imshow(A, cmap='gray')
ax1.set_title("Original Image (100% Data)")

ax2.imshow(A_compressed, cmap='gray')
ax2.set_title(f"Compressed Image (Keeping only {k} Singular Values)")

plt.show()