import numpy as np
import matplotlib.pyplot as plt

# 1. Set up the time axis (from 0 to 2*pi, 500 points for a smooth curve)
t = np.linspace(0, 2 * np.pi, 500)

# 2. Create the first wave (The fundamental frequency)
wave1 = np.sin(t)

# 3. Create the second wave (A higher frequency harmonic)
wave2 = (1/3) * np.sin(3 * t)

# 4. Add them together! (This is the Fourier magic)
complex_wave = wave1 + wave2

# 5. Plotting the results
fig, axs = plt.subplots(3, 1, figsize=(8, 8), sharex=True)

# Plot Wave 1
axs[0].plot(t, wave1, color='blue', linewidth=2)
axs[0].set_title("Wave 1: Fundamental Sine Wave (sin(t))", fontsize=12)
axs[0].grid(True, linestyle='--', alpha=0.7)

# Plot Wave 2
axs[1].plot(t, wave2, color='red', linewidth=2)
axs[1].set_title("Wave 2: Higher Frequency Harmonic (1/3 * sin(3t))", fontsize=12)
axs[1].grid(True, linestyle='--', alpha=0.7)

# Plot the Sum
axs[2].plot(t, complex_wave, color='purple', linewidth=2)
axs[2].set_title("The Complex Wave: Wave 1 + Wave 2", fontsize=12)
axs[2].set_xlabel("Time", fontsize=12)
axs[2].grid(True, linestyle='--', alpha=0.7)

plt.tight_layout()
plt.savefig('fourier_addition.png')