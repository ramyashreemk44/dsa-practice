
"""
LeetCode Problem: 71. Simplify Path
Link: https://leetcode.com/problems/simplify-path/

Approach:
- Use a stack to process directory tokens.
- Skip "." and empty segments.
- ".." pops the last valid directory from the stack.
"""

class SimplifyPath:
    def simplifyPath(self, path: str) -> str:
        stack = []
        cur = ""

        for char in path + "/":
            if char == "/":
                if cur == "..":
                    if stack:
                        stack.pop()
                elif cur != "." and cur != "":
                    stack.append(cur)
                cur = ""
            else:
                cur += char

        return "/" + "/".join(stack)

# Example usage:
if __name__ == "__main__":
    sp = SimplifyPath()
    print(sp.simplifyPath("/a/./b/../../c/"))  # Output: "/c"

