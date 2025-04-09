class Solution(object):
    def reverseString(self, s):
        """
        :type s: List[str]
        :rtype: None. Do not return anything, modify s in-place instead.
        """
        i = 0
        j = len(s) - 1

        while i <= j:
            s[i], s[j] = s[j], s[i]
            i += 1
            j -= 1

        return s  # optional, for local testing

# Example usage
if __name__ == "__main__":
    s = ["h", "e", "l", "l", "o"]
    Solution().reverseString(s)
    print(s)  # Output: ['o', 'l', 'l', 'e', 'h']
