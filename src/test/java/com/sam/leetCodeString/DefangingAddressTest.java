package com.sam.leetCodeString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefangingAddressTest {

    @Test
    void defangIpaddress() {
        assertEquals("1[.]1[.]1[.]1", DefangingAddress.defangIpaddress("1.1.1.1"));
    }
}