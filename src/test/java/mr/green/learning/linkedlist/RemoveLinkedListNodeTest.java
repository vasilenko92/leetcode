package mr.green.learning.linkedlist;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveLinkedListNodeTest {

    private final RemoveLinkedListNode tested = new RemoveLinkedListNode();


    @Test
    void whenEmptyNodeResultEqualsHead() {
        ListNode actual = tested.removeElements(new ListNode(), 1);

        assertThat(actual)
                .isEqualTo(new ListNode());
    }

    @Test
    void whenValPresentNodeRemoved() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(2);
        first.next = second;
        second.next = third;

        ListNode actual = tested.removeElements(first, 2);

        assertThat(actual)
                .isEqualTo(new ListNode(1, null));
    }


    @Test
    void whenValSameResultEmptyNode() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(1);
        first.next = second;
        second.next = third;

        ListNode actual = tested.removeElements(first, 1);

        assertThat(actual)
                .isNull();
    }

    @Test
    void whenValSameFirstNodeReturnSecondNode() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        first.next = second;


        ListNode actual = tested.removeElements(first, 1);

        assertThat(actual)
                .isEqualTo(second);
    }

}