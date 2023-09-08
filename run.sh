buildVersion="2.0.0.beta11"
./gradlew assemble -PBUILD_VERSION=${buildVersion}
./gradlew publish -PBUILD_VERSION=${buildVersion} --stacktrace

#curl http://10.0.0.162/service/rest/v1/repositories