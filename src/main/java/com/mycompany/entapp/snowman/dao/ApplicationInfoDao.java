/*
 * |-------------------------------------------------
 * | Copyright © 2017 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.entapp.snowman.dao;

import com.mycompany.entapp.snowman.model.AppInfo;

public interface ApplicationInfoDao {
    AppInfo loadApplicationInfo();
}