package br.com.bdd.jbehave

import br.com.bdd.jbehave.steps.SnackMachineSteps
import org.jbehave.core.configuration.Configuration
import org.jbehave.core.configuration.MostUsefulConfiguration
import org.jbehave.core.io.LoadFromClasspath
import org.jbehave.core.junit.JUnitStory
import org.jbehave.core.reporters.Format
import org.jbehave.core.reporters.StoryReporterBuilder
import org.jbehave.core.steps.InjectableStepsFactory
import org.jbehave.core.steps.InstanceStepsFactory


class TestAdder : JUnitStory() {

    override fun configuration(): Configuration {
        return MostUsefulConfiguration()
                .useStoryLoader(LoadFromClasspath(this.javaClass))
                .useStoryReporterBuilder(StoryReporterBuilder()
                        .withDefaultFormats()
                        .withFormats(Format.CONSOLE, Format.TXT, Format.HTML, Format.XML)
                        .withFailureTrace(true)
                        .withFailureTraceCompression(true))
    }
    override fun stepsFactory(): InjectableStepsFactory {
        return InstanceStepsFactory(configuration(), SnackMachineSteps())
    }
}