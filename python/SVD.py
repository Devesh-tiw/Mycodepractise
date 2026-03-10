import numpy as np

# 1. The Messy Data (Rows = Users, Columns = Movies)
# Scale of 0 to 5 stars.
ratings = np.array([
    [5, 5, 0, 0],  # Alice loves Sci-Fi, hates Rom-Coms
    [4, 5, 0, 0],  # Bob loves Sci-Fi too
    [0, 0, 5, 4],  # Charlie loves Rom-Coms, hates Sci-Fi
])

# 2. Run the SVD Magic! (The computer does all the lambda math instantly)
U, Sigma, VT = np.linalg.svd(ratings, full_matrices=False)

# 3. Let's see what the AI discovered!
print("--- AI's Hidden Concepts (Singular Values) ---")
# The AI doesn't know what "Sci-Fi" or "Rom-Com" is, but it will find 2 massive patterns!
print(np.round(Sigma, 2))

print("\n--- User Profiles (The U Matrix) ---")
# Watch how the AI mathematically groups Alice (Row 1) and Bob (Row 2) together, 
# while Charlie (Row 3) gets put in a completely different mathematical category!
print(np.round(U, 2))

print("\n--- Movie DNA (The VT Matrix) ---")
# Watch how the AI mathematically groups the first two movies together,
# and the last two movies together!
print(np.round(VT, 2))