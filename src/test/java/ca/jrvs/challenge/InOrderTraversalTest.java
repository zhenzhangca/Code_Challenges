package ca.jrvs.challenge;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class InOrderTraversalTest {

    @Test
    public void inOrder() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(8);
        bst.insert(1);
        bst.insert(4);
        bst.insert(11);
        List<Integer> result = InOrderTraversal.inOrder(bst.root);
        List<Integer> expect = new ArrayList<>();
        expect.add(1);
        expect.add(3);
        expect.add(4);
        expect.add(5);
        expect.add(8);
        expect.add(11);
        assertEquals(expect.toString(), result.toString());


    }
}