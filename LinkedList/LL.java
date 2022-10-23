//package LinkedList;
//
//public class LL {
//    private ListNode head;
//    private ListNode tail;
//    private int size;
//
//    public LL() {
//        this.size = 0;
//    }
//
//    //Singly Linked List
//
//    public void insertFirst(int val) {  //Insert the Node at the first index
//        ListNode node = new ListNode(val);
//        node.next = head;
//        head = node;
//
//        if (tail == null) {
//            tail = head;
//        }
//        size += 1;
//    }
//
//    public void insertLast(int val) {  //Insert the Node at the last index
//        if (tail == null) {
//            insertFirst(val);
//            return;
//        }
//        ListNode node = new ListNode(val);
//        tail.next = node;
//        tail = node;
//        size++;
//    }
//
////    public void insert(int val, int index) {  //Insert the node in between the index's.
////        if (index == 0) {
////            insertFirst(val);
////            return;
////        }
////        if (index == size) {
////            insertLast(val);
////            return;
////        }
////        Node temp = head;
////        for (int i = 1; i < index; i++) {
////            temp = temp.next;
////        }
////        Node node = new Node(val, temp.next);
////        temp.next = node;
////        size++;
////    }
////
////
////    //Insert Using Recursion
////    public void insertRec(int val, int index) {
////        head=insertRec(val, index, head);
////    }
////    private Node insertRec(int val, int index, Node node) {
////        if (index == 0) {
////            Node temp = new Node(val, node);
////            size++;
////            return temp;
////        }
////        node.next=insertRec(val, index-1, node.next);
////        return node;
////    }
////
////    public int deleteFirst(){  //Delete First element from an index
////        int val=head.value;
////        head=head.next;
////        if(head==null){
////            tail=null;
////        }
////        size--;
////        return val;
////    }
////
////    public int deleteLast(){  //Delete the Last node
////        if(size<=1){
////            return deleteFirst();
////        }
////        Node secondLast=get(size-2);
////        int val=tail.value;
////        tail=secondLast;
////        tail.next=null;
////        return val;
////    }
////
////    public int delete(int index){  //Delete the index as per your choice
////        //Complexity O(n)..
////        if(index==0){
////            return deleteFirst();
////        }
////        if(index==size-1){
////            return deleteLast();
////        }
////        Node prev=get(index-1);
////        int val=prev.next.value;
////        prev.next=prev.next.next;
////        return val;
////    }
////
////    public Node find(int value){  // Finding the value in the selected node
////        Node node=head;
////        while(node!=null){
////            if(node.value==value){
////                return node;
////            }
////            node=node.next;
////        }
////        return null;
////    }
////
////    public Node get(int index){
////        Node node=head;
////        for(int i=0; i<index; i++){
////            node=node.next;
////        }
////        return node;
////    }
//
//    public void display() {
//        ListNode temp = head;
//        while (temp != null) {
//            System.out.print(temp.value + " -> ");
//            temp = temp.next;
//        }
//        System.out.println("END");
//    }
//
//    private class ListNode {
//        private int value;
//        private ListNode next;
//
//        public ListNode(int value) {
//            this.value = value;
//        }
//
//        public ListNode(int value, ListNode next) {
//            this.value = value;
//            this.next = next;
//        }
//    }
//
//
//    //*****Interview Questions of LL*****//
//
//    public void duplicates() {
//        ListNode node = head;
//        while (node.next != null) {
//            if (node.value == node.next.value) {
//                node.next = node.next.next;
//                size--;
//            } else {
//                node = node.next;
//            }
//        }
//        tail = node;
//        tail.next = null;
//    }
//
//    //21. Merge Two Sorted Lists(LeetCode)
//
//    public static LL merge(LL first, LL second) {
//        ListNode f = first.head;
//        ListNode s = second.head;
//
//        LL ans = new LL();
//
//        while (f != null && s != null) {
//            if (f.value < s.value) {
//                ans.insertLast(f.value);
//                f = f.next;
//            } else {
//                ans.insertLast(s.value);
//                s = s.next;
//            }
//        }
//
//        while (f != null) {
//            ans.insertLast(f.value);
//            f = f.next;
//        }
//
//        while (s != null) {
//            ans.insertLast(s.value);
//            s = s.next;
//        }
//        return ans;
//    }
//
//
//    //202.> Happy number
//    public boolean isHappy(int n) {
//        int slow = n;
//        int fast = n;
//
//        do {
//            slow = findSquare(slow);
//            fast = findSquare(findSquare(fast));
//        } while (fast != slow);
//        if (slow == 1) {
//            return true;
//        }
//        return false;
//    }
//
//    private int findSquare(int number) {
//        int ans = 0;
//        while (number > 0) {
//            int rem = number % 10;
//            ans += rem * rem;
//            number /= 10;
//        }
//        return ans;
//    }
//
//    // 876.> get middle node of the linked list
//    public ListNode middleNode(ListNode head) {
//        ListNode s = head;
//        ListNode f = head;
//
//        while (f != null && f.next != null) {
//            s = s.next;
//            f = f.next.next;
//        }
//        return s;
//    }
//
//    //148.> TODO: Sort List in Linked List(used merge sort,, we can use bubble sort also)
//
//    public ListNode sortList(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//
//        ListNode mid = getMid(head);
//        ListNode left = sortList(head);
//        ListNode right = sortList(mid);
//
//        return merge(left, right);
//    }
//
//    ListNode merge(ListNode list1, ListNode list2) {
//        ListNode temp = new ListNode();
//
//        ListNode tail=temp;
//
//        while(list1!=null && list2!=null){
//            if(list1.val < list2.val){
//                tail.next=list1;
//                list1=list1.next;
//                tail=tail.next;
//            }else{
//                tail.next=list2;
//                list2=list2.next;
//                tail=tail.next;
//            }
//        }
//        tail.next=(list1!=null) ? list1:list2;
//        return temp.next;
//    }
//
//    ListNode getMid(ListNode head){
//        ListNode midPrev=null;
//        while(head!=null && head.next!=null){
//            midPrev=(midPrev==null)?head:midPrev.next;
//            head=head.next.next;
//        }
//        ListNode mid=midPrev.next;
//        midPrev.next=null;
//        return mid;
//    }
//
//
//    //recursion reverse
//    public void reverse(ListNode node){
//        if(node==tail){
//            head=tail;
//            return;
//        }
//        reverse(node.next);
//        tail.next=node;
//        tail=node;
//        tail.next=null;
//    }
//
//    //206.>in place reversal of Linked list
//    //google , microsoft, apple
//    public ListNode reverseList(ListNode head){
////        if(size<2){   //if lists size is less than 2
////            return;
////        }
//
//        if(head==null){  //if list is empty
//            return head;
//        }
//
//        ListNode prev=null;
//        ListNode present=head;
//        ListNode next=present.next;
//
//        while(present!=null){
//            present.next=prev;
//            prev=present;
//            present=next;
//            if(next!=null){
//                next=next.next;
//            }
//        }
//        return prev;
//    }
//
//    //92.>Reverse in Between
//    public ListNode reverseBetween(ListNode head, int left, int right) {
//        if(left==right){
//            return head;
//        }
//        //skip the first left-1 nodes
//        ListNode current=head;
//        ListNode prev=null;
//        for(int i=0; current!=null && i<left-1; i++){
//            prev=current;
//            current=current.next;
//        }
//
//        ListNode last=prev;
//        ListNode newEnd=current;
//
//        //reverse between left and right
//        ListNode next=current.next;
//        for(int i=0; current!=null && i<right-left+1; i++){
//            current.next=prev;
//            prev=current;
//            current=next;
//            if(next!=null){
//                next=next.next;
//            }
//        }
//        if(last!=null){
//            last.next=prev;
//        }else{
//            head=prev;
//        }
//
//        newEnd.next=current;
//        return head;
//    }
//
//    //234.>Palindrome Linked List
//    public boolean isPalindrome(ListNode head) {
//        ListNode mid=middleNode(head);
//        ListNode headSecond=reverseList(mid);
//        ListNode rereverseHead=headSecond;
//
//        //compare both the halfs
//        while(head!=null && headSecond!=null){
//            if(head.value!=headSecond.value){
//                break;
//            }
//            head=head.next;
//            headSecond=headSecond.next;
//        }
//        reverseList(rereverseHead);
//
//        return head==null || headSecond==null;
//    }
//
//    //143.> Reorder List
//    public void reorderList(ListNode head) {
//        if(head==null || head.next==null){
//            return;
//        }
//
//        ListNode mid=middleNode(head);
//
//        ListNode hs=reverseList(mid);
//        ListNode hf=head;
//
//        //rearrange
//        while(hf!=null && hs!=null){
//            ListNode temp=hf.next;
//            hf.next=hs;
//            hf=temp;
//
//            temp=hs.next;
//            hs.next=hf;
//            hs=temp;
//        }
//        //next of tail to null
//        if(hf!=null){
//            hf.next=null;
//        }
//    }
//
//    //25.> Reverse Node in K-Group
//    //it is also reversing the < k end items -> modify it accordingly
//    //T.C -- O(n)  S.C -- O(1)
//    public ListNode reverseKGroup(ListNode head, int k) {
//        if(k<=1 || head==null){
//            return head;
//        }
//
//        //skip the first left-1 nodes
//        ListNode current=head;
//        ListNode prev=null;
//
//        while(true) {
//            ListNode last=prev;
//            ListNode newEnd=current;
//
//            //reverse between left and right
//            ListNode next=current.next;
//            for(int i=0; current!=null && i<k; i++){
//                current.next=prev;
//                prev=current;
//                current=next;
//                if(next!=null){
//                    next=next.next;
//                }
//            }
//            if(last!=null){
//                last.next=prev;
//            }else{
//                head=prev;
//            }
//
//            newEnd.next=current;
//
//            if(current==null){
//                break;
//            }
//            prev=newEnd;
//        }
//        return head;
//    }
//
//
//    //GFG Question Reverse Alternate K Group
//    public ListNode reverseAlterKGroup(ListNode head, int k) {
//        if(k<=1 || head==null){
//            return head;
//        }
//
//        //skip the first left-1 nodes
//        ListNode current=head;
//        ListNode prev=null;
//
//        while(current!=null) {
//            ListNode last=prev;
//            ListNode newEnd=current;
//
//            //reverse between left and right
//            ListNode next=current.next;
//            for(int i=0; current!=null && i<k; i++){
//                current.next=prev;
//                prev=current;
//                current=next;
//                if(next!=null){
//                    next=next.next;
//                }
//            }
//            if(last!=null){
//                last.next=prev;
//            }else{
//                head=prev;
//            }
//
//            newEnd.next=current;
//            //skip the k node
//            for(int i=0; current!=null && i<k; i++){
//                prev=current;
//                current=current.next;
//            }
//        }
//        return head;
//    }
//
//
//    //61. Rotate List
//    public ListNode rotateRight(ListNode head, int k) {
//        if(k<0 || head==null || head.next==null){
//            return head;
//        }
//        ListNode last=head;
//        int length = 1;
//        while(last.next!=null){
//            last=last.next;
//            length++;
//        }
//
//        last.next=head;
//        int rotations=k%length;
//        int skip=length-rotations;
//        ListNode newlast=head;
//
//        for(int i=0; i<skip-1; i++){
//            newlast=newlast.next;
//        }
//        head=newlast.next;
//        newlast.next=null;
//
//        return head;
//    }
//}
//
//
