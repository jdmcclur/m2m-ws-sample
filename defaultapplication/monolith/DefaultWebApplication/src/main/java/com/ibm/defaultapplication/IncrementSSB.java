//
// 5630-A23, 5630-A22, (C) Copyright IBM Corporation, 2019
// All rights reserved. Licensed Materials Property of IBM
// Note to US Government users: Documentation related to restricted rights
// Use, duplication or disclosure is subject to restrictions set forth in GSA ADP Schedule with IBM Corp.
// This page may contain other proprietary notices and copyright information, the terms of which must be observed and followed.
//
//
package com.ibm.defaultapplication;

import javax.persistence.*;
import javax.ejb.*;
import com.ibm.defaultapplication.Increment;

@Stateless(name="IncrementEJB")
public class IncrementSSB {
  private static int hitcount = 0;
  //@PersistenceContext(unitName="DefaultApplicationJPA")
  //private EntityManager em;

  public int getTheValue() {
    //Increment inc = em.find(Increment.class, "HitCount");
    //return inc.getThevalue();
    return hitcount;
  }

  public int increment() {
	  /*int value = 0;
    synchronized (this) {
        Increment inc = em.find(Increment.class, "HitCount");
        if (inc == null) {
        inc.setThevalue(value);
        em.persist(inc);
    }
    return value;*/
    hitcount+=1;
    return hitcount;
  }
}
