/*
 * Copyright (c) 2014 Irian Software Development SRL. All Rights Reserved.
 * This software is the proprietary information of Irian Software Development SRL.
 * Use is subject to license and non-disclosure terms
 */

package ro.irian.fullstack.pizza.domain.entity;

import java.util.UUID;

public class UUIDGenerator {
    public static String next() {
           return UUID.randomUUID().toString().replaceAll("-", ""); // replace "-" 36 -> 32 char
        }
}


