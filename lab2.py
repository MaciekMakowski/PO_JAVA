from typing import Any

class Node:
    def __init__(self, value):
        self.value = value
        self.next = None


class LinkedList:
    def __init__(self, node=None):
        self.head = node
        self.tail = node

    def __len__(self):
        node = self.head
        count = 0
        while(node != None):
            count +=1
            node = node.next
        return count

    def __str__(self):
        str_out = ""
        node = self.head
        while(node != None):
            if(node.next != None):
                str_out+=str(node.value)+" -> "
            else:
                str_out+=str(node.value)
            node = node.next
        return str_out

    def push(self, value: Any):
        new_node = Node(value)
        new_node.next = self.head
        self.head = new_node

    def insert(self, value: Any, after: Node):
        if(after == None):
            raise ValueError("Podano zly after")
        new_node = Node(value)
        new_node.next = after.next
        after.next = new_node

    def append(self, value: Any):
        new_node = Node(value)
        if(self.head == None):
            self.head = new_node
        else:
            node_tmp = self.head
            while(node_tmp.next != None):
                node_tmp = node_tmp.next
            node_tmp.next = new_node

    def node(self, at: int):
        if(at < 0):
            raise ValueError("Bledny index")

        if(at < len(self)):
            node = self.head
            for i in range(at):
                node = node.next
        else:
            raise ValueError("Bledny index")
        return node

    def remove(self, after: Node):
        if(after != None):
            if(after.next == None):
                raise ValueError("Nie da sie usunac tego Noda")
        if(after == None):
            raise ValueError("Nie da sie usunac tego Noda")
        node = self.head
        while node != after:
            node = node.next
        node = node.next
        node2 = node
        after.next = node.next
        return node2

    def remove_last(self):
        node = self.head
        while(node.next.next != None):
            node = node.next
        tmp =node.next.value
        node.next = None
        return tmp


    def pop(self):
        node = self.head
        self.head = node.next
        return node.value


class Stack:
    def __init__(self):
       self._storage: LinkedList = LinkedList()

    def __len__(self):
        return  self._storage.__len__()
    def __str__(self):
        return self._storage.__str__().replace(" -> ","\n")

    def push(self, element:Any):
        self._storage.push(element)


    def pop(self):
        return self._storage.pop()

class Queue:
    def __init__(self):
        self._storage = LinkedList()

    def __str__(self):
        return self._storage.__str__().replace(" -> ",", ")

    def __len__(self):
        return self._storage.__len__()

    def peek(self):
        return self._storage

    def enqueue(self, element:Any):
        self._storage.append(element)

    def dequeue(self):
        return  self._storage.pop()





list_ = LinkedList()
assert list_.head == None

list_.push(1)
list_.push(0)
assert str(list_) == '0 -> 1'

list_.append(9)
list_.append(10)
middle_node = list_.node(at=1)
list_.insert(5, after=middle_node)
assert str(list_) == '0 -> 1 -> 5 -> 9 -> 10'

first_element = list_.node(at=0)
returned_first_element = list_.pop()
assert first_element.value == returned_first_element

last_element = list_.node(at=3)
returned_last_element = list_.remove_last()
assert last_element.value == returned_last_element
assert str(list_) == '1 -> 5 -> 9'

second_node = list_.node(at=1)
list_.remove(second_node)
assert str(list_) == '1 -> 5'




stack = Stack()
assert len(stack) == 0

stack.push(3)
stack.push(10)
stack.push(1)
assert len(stack) == 3

top_value = stack.pop()
assert top_value == 1
assert len(stack) == 2



queue = Queue()
assert len(queue) == 0

queue.enqueue('klient1')
queue.enqueue('klient2')
queue.enqueue('klient3')
assert str(queue) == "klient1, klient2, klient3"

client_first = queue.dequeue()
assert client_first == 'klient1'
assert str(queue) == 'klient2, klient3'
assert len(queue) == 2