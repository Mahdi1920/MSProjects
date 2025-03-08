package tn.starter.mysqlShared.config;

//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AbstractAuthenticationToken;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.oauth2.jwt.Jwt;
//import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
//import org.springframework.security.oauth2.server.resource.authentication.JwtGrantedAuthoritiesConverter;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.core.convert.converter.Converter;
//
//import java.util.Collection;
//import java.util.Map;
//import java.util.Set;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;

//@Configuration
//@EnableWebSecurity
//@EnableMethodSecurity(prePostEnabled = true)
public class SecurityConfig {
//	@Value("${spring.security.oauth2.resourceserver.jwt.jwk-set-uri}")
//	String jwkSetUri;
//
//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//		http.
//				sessionManagement(sm -> sm.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//				.csrf(csrf -> csrf.disable())
//				.authorizeHttpRequests((authorize) -> authorize.requestMatchers(AUTH_WHITELIST).permitAll())
//				.authorizeHttpRequests((authorize) -> authorize.anyRequest().authenticated())
//				.oauth2ResourceServer(oAuth2ResourceServerConfigurer -> oAuth2ResourceServerConfigurer.jwt(jwt -> jwt.jwtAuthenticationConverter(new JwtAuthConverter())));
//
//		return http.build();
//	}
//
//	private static final String[] AUTH_WHITELIST = {
//			// -- Swagger UI v3
//			"/v3/api-docs/**",
//			"/v2/api-docs", "/swagger-resources", "/swagger-resources/**",
//			"/swagger-ui/**",
//			// welcome test rest endpoints
//			"/api/candiadat/**"
//
//	};
//
//
//	public class JwtAuthConverter implements Converter<Jwt, AbstractAuthenticationToken> {
//		private final JwtGrantedAuthoritiesConverter jwtGrantedAuthoritiesConverter = new JwtGrantedAuthoritiesConverter();
//
//		@Override
//		public AbstractAuthenticationToken convert(Jwt jwt) {
//			Collection<GrantedAuthority> authorities = Stream.concat(
//					jwtGrantedAuthoritiesConverter.convert(jwt).stream(),
//					extractResourceRoles(jwt).stream()
//			).collect(Collectors.toSet());
//			return new JwtAuthenticationToken(jwt, authorities, jwt.getClaim("preferred_username"));
//		}
//
//		private Collection<GrantedAuthority> extractResourceRoles(Jwt jwt) {
//			Map<String, Object> realmAccess;
//			Collection<String> roles;
//			if (jwt.getClaim("realm_access") == null) {
//				return Set.of();
//			}
//			realmAccess = jwt.getClaim("realm_access");
//			roles = (Collection<String>) realmAccess.get("roles");
//			return roles.stream().map(role -> new SimpleGrantedAuthority(role)).collect(Collectors.toSet());
//		}
//	}
}