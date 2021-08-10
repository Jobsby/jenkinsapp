job('NodeJS Jenkins example') {
    scm {
        git('git://github.com/Jobsby/jenkinsapp.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('Kyrian')
            node / gitConfigEmail('akyrian@gmx.net')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}