package book.k8sinfra.aggregateservice.infrastructure

import io.prometheus.client.exemplars.tracer.otel_agent.OpenTelemetryAgentSpanContextSupplier
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OtelMetricsConfiguration {
    @Bean
    fun PrometheusExemplarSamplerConfiguration(): OpenTelemetryAgentSpanContextSupplier {
        return OpenTelemetryAgentSpanContextSupplier()
    }
}