def gitDownload(repo){
 git "https://github.com/intelliqittrainings/${repo}.git"
}0
def mavenBuild(){
  sh "mvn package"
}
