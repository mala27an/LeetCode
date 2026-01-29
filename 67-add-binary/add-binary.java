class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder(); // because String is immutable so we are using StringBuilder

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {

            int sum = carry;

            if (i >= 0) {
                sum = sum + (a.charAt(i) - '0');
                i--;
            }

            if (j >= 0) {
                sum = sum + (b.charAt(j) - '0'); // ASCII table trick for -'0'
                j--;
            }

            result.append(sum % 2);
            carry = sum / 2;
        }

        if (carry == 1) {
            result.append(1);
        }

        return result.reverse().toString();
    }
}