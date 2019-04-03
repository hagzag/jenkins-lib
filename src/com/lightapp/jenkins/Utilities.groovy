package com.lightapp.jenkins;

class Utilities implements Serializable {

    def script;

    Utilities(script){
        this.script = script
    }

    def slsStgRun(module, stg) {
        script.sh "echo ${module} , ${stg}"
    }


}
