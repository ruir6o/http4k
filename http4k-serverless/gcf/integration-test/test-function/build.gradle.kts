description = "Testing against a functions deployed to GCF"

apply(plugin = "com.github.johnrengelman.shadow")

dependencies {
    api(project(":http4k-serverless-gcf"))
    api(project(path = ":http4k-core", configuration ="testArtifacts"))
    api(project(path = ":http4k-serverless-core", configuration ="testArtifacts"))   
}
