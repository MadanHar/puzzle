package com.au.gov.service;

import com.au.gov.list.CircularLinkedList;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/***
 * Please uncomment the playGame which i have given two solutions , one with Josephus problem and another one using circular lined list
 * Josephus Performs much better with is O(n) and other one is O(n)(n-1)/2 , just because i am using modulus for how much i am traversing in the linked list
 */
public class ChildrenGameServiceImpl implements ChildrenGameService {

   /* @Override
    public Integer playGame(int noOfChildren, final int noToEliminate) {
        int tempPos = noToEliminate - 1;
        int[] people = new int[noOfChildren];

        for (int i = 0; i < noOfChildren; i++) {
            people[i] = i + 1;
        }

        int iteration = noOfChildren - 1;

        List<Integer> list = IntStream.of(people).boxed().collect(Collectors.toList());

        while (iteration > 0) {
            System.out.println("The child removed was :"+ list.get(tempPos));
            list.remove(tempPos);
            tempPos += noToEliminate - 1;
            if (tempPos > list.size() - 1) {
                tempPos = tempPos % list.size();
            }
            iteration--;
        }

        return list.get(0);
    }*/

    @Override
    public Integer playGame(final int noOfChildren, final int noToEliminate) {
        CircularLinkedList circularLinkedList = createNNodesList(noOfChildren);
        while (circularLinkedList.getHead() != circularLinkedList.getTail()) {
            removeKthElement(noToEliminate % noOfChildren, circularLinkedList);
        }
        System.out.println("Last remaining child is: " + circularLinkedList.getHead().getValue());
        return circularLinkedList.getHead().getValue();
    }


    private CircularLinkedList createNNodesList(final int n) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        for (int i = 1; i <= n; i++) {
            circularLinkedList.addNodes(i);
        }
        return circularLinkedList;
    }

    private void removeKthElement(final int k, final CircularLinkedList circularLinkedList) {
        circularLinkedList.traverseNElements(k-1);
        System.out.println("Deleting the child number :" + circularLinkedList.getHead().getValue());
        circularLinkedList.deleteHead();
    }
}
