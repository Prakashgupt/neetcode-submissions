class Solution {
    public boolean isPalindrome(String s) {
                String cleaned = s.chars()
                .filter(Character::isLetterOrDigit)
                .mapToObj(c -> String.valueOf((char) c).toLowerCase())
                .collect(Collectors.joining());

        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);

    }
}
