class Solution {
    public static String repeatLimitedString(String s, int repeatLimit) {
        int[] ch = new int[26];
        for (char c : s.toCharArray()) {
            ch[c - 'a']++;
        }

        StringBuilder result = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < 26; i++) {
            if (ch[i] > 0) {
                pq.offer(i);
            }
        }

        while (!pq.isEmpty()) {
            int current = pq.poll();
            int limit = Math.min(ch[current], repeatLimit);

            for (int i = 0; i < limit; i++) {
                result.append((char) (current + 'a'));
            }
            ch[current] -= limit;

            if (ch[current] > 0) {
                if (pq.isEmpty()) break;

                int next = pq.poll();
                result.append((char) (next + 'a'));
                ch[next]--;
                if (ch[next] > 0) pq.offer(next);
                pq.offer(current);
            }
        }

        return result.toString();
    }
}