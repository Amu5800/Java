
public void countSubstrings(String str, int k) {

    for (int i = 0; i <= str.length() - k; i++) {

        String sub = str.substring(i, i + k);
        int count = 0;

        for (int j = 0; j <= str.length() - k; j++) {

            String temp = str.substring(j, j + k);

            if (sub.equals(temp)) {
                count++;
            }
        }

        // Print only the first occurrence of each substring
        boolean alreadyPrinted = false;

        for (int j = 0; j < i; j++) {
            if (str.substring(j, j + k).equals(sub)) {
                alreadyPrinted = true;
                break;
            }
        }

        if (!alreadyPrinted) {
            System.out.println(sub + " --> " + count);
        }
    }
}
