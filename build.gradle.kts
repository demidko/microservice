import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

repositories {
  mavenCentral()
  maven("https://jitpack.io")
  maven("https://repo.spring.io/milestone")
  maven("https://repo.spring.io/snapshot")
}
plugins {
  id("org.springframework.boot") version "3.3.0-SNAPSHOT"
  id("io.spring.dependency-management") version "1.1.4"
  kotlin("jvm") version "2.0.0-Beta4"
  kotlin("plugin.spring") version "2.0.0-Beta4"
}
dependencies {
  implementation("org.springframework.boot:spring-boot-starter-web")
  implementation("org.jetbrains.kotlin:kotlin-reflect")
  testImplementation("org.springframework.boot:spring-boot-starter-test")
  testImplementation("com.google.truth:truth:1.2.0")
  testImplementation("io.mockk:mockk:1.13.4")
  testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}
tasks.withType<KotlinCompile> {
  kotlinOptions.jvmTarget = "21"
  kotlinOptions.freeCompilerArgs += listOf(
    "-Xjsr305=strict",
    "-Xvalue-classes",
    "-opt-in=kotlin.ExperimentalStdlibApi",
    "-opt-in=kotlin.time.ExperimentalTime"
  )
}
tasks.withType<JavaCompile> {
  sourceCompatibility = "21"
  targetCompatibility = "21"
}
tasks.test {
  useJUnitPlatform()
  jvmArgs("--enable-preview")
}
tasks.bootJar {
  archiveVersion.set("boot")
}
