#!/usr/bin/env groovy
def call() {
	pipeline {
	
	stages {
	  stage ('Test1') {
	    steps {
		  script {
		    println "This is a test"
			}
		}
			
	  }
	}
	post {
	  always {
	    println "Ending ..."
	  }
	}
}	