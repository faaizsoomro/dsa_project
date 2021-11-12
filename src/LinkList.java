
public class LinkList {

    private Link first;

    public LinkList() {
        first = null;
    }

    public Boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(String id) {
        Link newLink = new Link(id);
        newLink.next = first;
        first = newLink;
    }

    public String deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp.iData;
    }

    public void deleteAll() {
        if (isEmpty()) {
            System.out.println("List is Empty");
        } else {
            first = null;
        }

    }

    public void displayList() {
        System.out.print("List (first-->last):");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    public Link find(String key) {
        Link element = first;
        while (key != element.iData) {
            if (element.next == null) {
                return null;
            } else {
                element = element.next;
            }
        }
        return element;
    }

    public Link deleteItem(String a) {
        Link current = first;
        Link previous = first;
        while (a != current.iData) {
            if (current.next == null) {
                return null;
            } else {
                previous = current;
            }
            current = current.next;
        }
        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
        return current;

    }

    public String getValue() {
        Link temp = first;
        return temp.iData;
    }
}
