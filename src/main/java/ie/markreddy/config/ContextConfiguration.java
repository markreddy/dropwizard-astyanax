package ie.markreddy.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class ContextConfiguration {

    @NotEmpty
    @JsonProperty
    private String clusterName = "Test_Cluster";

    @JsonProperty
    private String keyspaceName = "DropwizardAstyanaxKeyspace";

    @JsonProperty
    AstyanaxConfiguration astyanaxConfiguration;

    @JsonProperty
    ConnectionPoolConfiguration connectionPoolConfiguration;

    public ContextConfiguration() {
    }

    public String getClusterName() {
        return clusterName;
    }

    public String getKeyspaceName() {
        return keyspaceName;
    }

    public ConnectionPoolConfiguration getConnectionPoolConfiguration() {
        return connectionPoolConfiguration;
    }

    public AstyanaxConfiguration getAstyanaxConfiguration() {
        return astyanaxConfiguration;
    }
}
