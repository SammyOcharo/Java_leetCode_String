package com.sam.leetCodeString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefangingAddressTest {

    @Test
    void defangIpaddress() {
        assertEquals("1[.]1[.]1[.]1", DefangingAddress.defangIpaddress("1.1.1.1"));
        assertEquals("255[.]100[.]50[.]0", DefangingAddress.defangIpaddress("255.100.50.0"));
        assertNotEquals("255[.]100[.]50[.]0", DefangingAddress.defangIpaddress("255.110.50.0"));
    }
}