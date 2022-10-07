package com.company;

public class SNode {
        SNode nxt;
        SNode prev;
        Integer key;
        Integer value;

        public void setData(Integer key, Integer value) {
            this.value = value;
            this.key = key;
        }

        public SNode getNode() {
            return this;
        }

        public int getKey() {
            return this.key;
        }

        public int getValue() {
            return this.value;
        }

        public SNode(Integer key, Integer data) {
            this.setData(key, this.value);
        }
    }

