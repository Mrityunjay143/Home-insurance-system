package com.mrityunjay.restapi.services;

import java.util.List;

import com.mrityunjay.restapi.entities.Homeowner;
import com.mrityunjay.restapi.entities.Location;
import com.mrityunjay.restapi.entities.Policy;
import com.mrityunjay.restapi.entities.Property;
import com.mrityunjay.restapi.entities.Quotation;
import com.mrityunjay.restapi.entities.User;;

public interface InsuranceService {

	public List<User> getUsers();

	public User getUser(long id);

	public User getUser(String username, String password);

	public User addUser(User user);

	public List<Quotation> getQuotations();

	public Quotation getQuotation(Long id);

	public List<Quotation> getQuotations(String username);

	public Quotation addQuotation(Quotation quotation);

	public List<Location> getLocations();

	public Location addLocation(Location location);

	public List<Homeowner> getHomeowners();

	public Homeowner addHomeowner(Homeowner homeowner);

	public List<Property> getProperties();

	public Property addProperty(Property property);

	public List<Policy> getPolicies();

	public List<Policy> getPolicies(String username);

	public Policy getPolicy(Long quotationId);

	public Policy addPolicy(Policy policy);
}
