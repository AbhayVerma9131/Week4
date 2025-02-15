package abhay.listinterface;
public class FindNthElement {

    // Method to find the Nth element from the end
    public static char findNthFromEnd(ListNode head, int N) {
        ListNode fast = head;
        ListNode slow = head;

        // Move the fast pointer N steps ahead
        for (int i = 0; i < N; i++) {
            if (fast == null) {
                throw new IllegalArgumentException("N is larger than the size of the list");
            }
            fast = fast.next;
        }

        // Move both pointers one step at a time until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Return the value of the slow pointer, which is the Nth node from the end
        return slow.value;
    }

    public static void main(String[] args) {
        // Example input: List [A, B, C, D, E]
        ListNode head = new ListNode('A');
        head.next = new ListNode('B');
        head.next.next = new ListNode('C');
        head.next.next.next = new ListNode('D');
        head.next.next.next.next = new ListNode('E');

        int N = 2;

        // Call the method and print the result
        char result = findNthFromEnd(head, N);
        System.out.println(result);  // Expected: D
    }
}
