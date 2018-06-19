/*

   Derby - Class org.apache.derby.iapi.sql.depend.Provider

   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to you under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

 */

package org.apache.derby.iapi.sql.depend;

import	org.apache.derby.catalog.Dependable;

import org.apache.derby.iapi.error.StandardException;

import org.apache.derby.iapi.sql.conn.LanguageConnectionContext;

/**
	A provider is an object that others can build dependencies
	on.  Providers can themselves also be dependents and thus
	be invalid/revalidated in turn. Revalidating a provider may,
	as a side-effect, re-validate its dependents -- it is up to
	the implementation to determine the appropriate action.
 */
public interface Provider extends Dependable
{

}
