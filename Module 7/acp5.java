
public int countOccurrences(String P, String T) {
    int count = 0;

    for (int i = 0; i <= T.length() - P.length(); i++) {
        String sub = T.substring(i, i + P.length());

        if (sub.equalsIgnoreCase(P)) {
            count++;
        }
    }

    return count;
}
