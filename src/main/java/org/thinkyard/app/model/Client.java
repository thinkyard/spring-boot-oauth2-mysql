package org.thinkyard.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "oauth_client_details")
@Getter
@Setter
@NoArgsConstructor
public class Client {
	@Id
	@Column(name = "client_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String clientId;

	@Column(name = "resource_ids")
	private String clientResourceIds;

	@Column(name = "client_secret")
	private String clientSecret;

	@Column(name = "scope")
	private String clientScope;

	@Column(name = "authorized_grant_types")
	private String clientGrantTypes;

	@Column(name = "web_server_redirect_uri")
	private String clientRedirectUrl;

	@Column(name = "authorities")
	private String clientAuthorities;

	@Column(name = "access_token_validity")
	private Integer accessTokenValidity;

	@Column(name = "refresh_token_validity")
	private Integer refreshTokenValidity;

	@Column(name = "additionalInformation")
	private String appAdditionalInformation;

	@Column(name = "autoapprove")
	private Boolean autoApproveScopes;

	public Client(Client client) {
		this.clientId = client.getClientId();
		this.clientResourceIds = client.getClientResourceIds();
		this.clientSecret = client.getClientSecret();
		this.clientScope = client.getClientScope();
		this.clientGrantTypes = client.getClientGrantTypes();
		this.clientRedirectUrl = client.getClientRedirectUrl();
		this.clientAuthorities = client.getClientAuthorities();
		this.accessTokenValidity = client.getAccessTokenValidity();
		this.refreshTokenValidity = client.getRefreshTokenValidity();
		this.appAdditionalInformation = client.getAppAdditionalInformation();
		this.autoApproveScopes = client.getAutoApproveScopes();
	}
}
