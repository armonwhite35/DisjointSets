package com.company;

public class DisjointSet {
    private int [] numTree;

    DisjointSet(int size){//constructor creates node array and set to its own root
        numTree = new int[size];
        for (int i = 0; i < size; i++){
            numTree[i] = -1;
        }
    }

    public void union (int a, int b){
        int r1 = find(a);
        int r2 = find(b);
        if (r1 != r2){
            numTree[r1] = r2;
        }
    }

    public int find(int track){
        while (numTree[track] != -1){
            track = numTree[track];
        }
        return track;
    }

    public void printDSets(){//prints equivalence sets
        for(int i = 0; i < numTree.length; i++){
            System.out.print(find(i));
        }
        System.out.println();
    }
}
