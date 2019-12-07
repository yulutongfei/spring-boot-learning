plugins {
    java
    id("org.springframework.boot") version "2.2.1.RELEASE"
    id("io.spring.dependency-management") version "1.0.8.RELEASE"
}

group = "com.sunxu"
version = "1.0-SNAPSHOT"


// 定义仓库
repositories {
    maven("http://maven.aliyun.com/nexus/content/repositories/jcenter")
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot", "spring-boot-starter-web")
    implementation("org.springframework.boot", "spring-boot-devtools")
    implementation("org.projectlombok:lombok:1.16.16")
    testImplementation("org.springframework.boot", "spring-boot-starter-test")
}


configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks {
    // 修改task.jar
    jar {
        archiveBaseName.set("spring-boot-learning")
        archiveVersion.set("0.1.0")
        archiveExtension.set("jar")
        manifest {
            attributes (
                "Implementation-Title" to archiveBaseName,
                "Implementation-Version" to archiveVersion
            )
        }
    }
}
