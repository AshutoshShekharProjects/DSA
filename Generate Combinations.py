def generate_combinations(s, curr, ans):
    if not s:  # Base case: no characters left to process
        ans.append(''.join(curr))  # Append the current combination
        return

    # Include the current character
    generate_combinations(s[1:], curr + [s[0]], ans)

    # Exclude the current character
    generate_combinations(s[1:], curr, ans)

# Example usage
s = "abc"
ans = []
generate_combinations(s, [], ans)
print(ans)