repositories {
  mavenCentral()
  maven("https://jitpack.io")
  maven("https://repo.spring.io/milestone")
  maven("https://repo.spring.io/snapshot")
}
plugins {
  id("org.springframework.boot") version "3.0.0-SNAPSHOT"
  id("io.spring.dependency-management") version "1.0.11.RELEASE"
  kotlin("jvm") version "1.7.0"
  kotlin("plugin.spring") version "1.7.0"
  kotlin("plugin.serialization") version "1.7.0"
}
dependencies {
  implementation("org.springframework.boot:spring-boot-starter-web")
  implementation("org.jetbrains.kotlin:kotlin-reflect")
  implementation("com.github.demidko:telegram-storage:2022.05.30")
  implementation("org.apache.commons:commons-csv:1.9.0")
  implementation("org.apache.httpcomponents:httpclient:4.5.13")
  testImplementation("org.springframework.boot:spring-boot-starter-test")
  testImplementation("org.amshove.kluent:kluent:1.68")
  testImplementation("io.mockk:mockk:1.12.4")
}
version = "boot"
tasks.compileKotlin {
  kotlinOptions.jvmTarget = "18"
  kotlinOptions.freeCompilerArgs += listOf("-opt-in=kotlin.time.ExperimentalTime", "-Xjsr305=strict", "-Xuse-k2")
}
tasks.compileTestKotlin {
  kotlinOptions.jvmTarget = "18"
  kotlinOptions.freeCompilerArgs += listOf("-opt-in=kotlin.time.ExperimentalTime", "-Xjsr305=strict", "-Xuse-k2")
}
tasks.test {
  useJUnitPlatform()
}