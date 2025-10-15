import org.gradle.api.JavaVersion.VERSION_21
import org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_21

repositories {
  mavenCentral()
  maven("https://jitpack.io")
  maven("https://repo.spring.io/milestone")
  maven("https://repo.spring.io/snapshot")
}
plugins {
  id("org.springframework.boot") version "4.0.0-SNAPSHOT"
  id("io.spring.dependency-management") version "1.1.7"
  kotlin("jvm") version "2.2.20"
  kotlin("plugin.spring") version "2.2.20"
}
dependencies {
  implementation("org.jetbrains.kotlin:kotlin-reflect")
  implementation("org.springframework.boot:spring-boot-starter-web")
  // for schema.sql auto initialization:
  //  implementation("org.springframework.boot:spring-boot-starter-jdbc")
  testImplementation("io.mockk:mockk:1.13.14")
  testImplementation("com.google.truth:truth:1.4.4")
  testRuntimeOnly("org.junit.platform:junit-platform-launcher")
  testImplementation("org.springframework.boot:spring-boot-starter-test")
}
java {
  sourceCompatibility = VERSION_21
  targetCompatibility = VERSION_21
}
kotlin {
  compilerOptions {
    jvmTarget = JVM_21
    freeCompilerArgs.addAll(
      "-Xjsr305=strict",
      "-Xannotation-default-target=param-property",
      "-Xvalue-classes"
    )
  }
}
tasks.test {
  useJUnitPlatform {
    if (System.getProperties().containsKey("idea.version").not()) {
      excludeTags("manual")
    }
  }
  jvmArgs("--enable-preview")
}
tasks.bootJar {
  archiveVersion.set("boot")
}
