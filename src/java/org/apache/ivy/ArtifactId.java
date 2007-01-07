/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.apache.ivy;

/**
 * Identifies an artifact in a module, without revision information
 */
public class ArtifactId {
    private ModuleId _mid;
    private String _name;
    private String _type;
    private String _ext;
    
    
    /**
     * @param mid
     * @param name
     * @param type
     */
    public ArtifactId(ModuleId mid, String name, String type, String ext) {
        _mid = mid;
        _name = name;
        _type = type;
        _ext = ext;
    }
    
    public boolean equals(Object obj) {
        if (! (obj instanceof ArtifactId)) {
            return false;
        }
        ArtifactId aid = (ArtifactId)obj;
        return getModuleId().equals(aid.getModuleId()) 
            && getName().equals(aid.getName()) 
            && getExt().equals(aid.getExt()) 
            && getType().equals(aid.getType());
    }
    
    public int hashCode() {
        int hash = 17;
        hash += getModuleId().hashCode() * 37;
        hash += getName().hashCode() * 37;
        hash += getType().hashCode() * 37;
        return hash;
    }
    
    public String toString() {
        return getModuleId()+" "+getName()+"."+getType();
    }
    
    /**
     * @return Returns the module id.
     */
    public ModuleId getModuleId() {
        return _mid;
    }
    /**
     * @return Returns the name.
     */
    public String getName() {
        return _name;
    }
    /**
     * @return Returns the type.
     */
    public String getType() {
        return _type;
    }
    /**
     * @return Returns the ext.
     */
    public String getExt() {
        return _ext;
    }
}