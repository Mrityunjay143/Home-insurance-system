package com.mrityunjay.restapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrityunjay.restapi.dao.HomeownerDao;
import com.mrityunjay.restapi.dao.LocationDao;
import com.mrityunjay.restapi.dao.PolicyDao;
import com.mrityunjay.restapi.dao.PropertyDao;
import com.mrityunjay.restapi.dao.QuotationDao;
import com.mrityunjay.restapi.dao.UserDao;
import com.mrityunjay.restapi.entities.Homeowner;
import com.mrityunjay.restapi.entities.Location;
import com.mrityunjay.restapi.entities.Policy;
import com.mrityunjay.restapi.entities.Property;
import com.mrityunjay.restapi.entities.Quotation;
import com.mrityunjay.restapi.entities.User;

@Service
public class InsuranceServiceImpl implements InsuranceService{

	@Autowired
	private UserDao userDao;

	@Autowired
	private QuotationDao quotationDao;

	@Autowired
	private LocationDao locationDao;

	@Autowired
	private HomeownerDao homeownerDao;

	@Autowired
	private PropertyDao propertyDao;

	@Autowired
	private PolicyDao policyDao;

	public InsuranceServiceImpl() {
	}

	public List<User> getUsers() {
		return userDao.findAll();
	}

	public User getUser(long id) {
		return userDao.findById(id).get();
	}

	
	public User addUser(User user) {
		return userDao.save(user);
	}

	
	public User getUser(String username, String password) {
		User user = userDao.findByUsername(username);
		if (user == null) {
			// throw new RuntimeException("User does not exist.");
			return null;
		}
		if (!user.getPassword().equals(password)) {
			// throw new RuntimeException("Password mismatch.");
			return null;
		}
		return user;
	}

	
	public List<Quotation> getQuotations() {
		return quotationDao.findAll();
	}

	
	public Quotation addQuotation(Quotation quotation) {
		return quotationDao.save(quotation);
	}

	
	public List<Quotation> getQuotations(String username) {
		return quotationDao.findByUsername(username);
	}

	
	public Quotation getQuotation(Long id) {
		return quotationDao.findById(id).get();
	}

	
	public List<Location> getLocations() {
		return locationDao.findAll();
	}

	
	public Location addLocation(Location location) {
		return locationDao.save(location);
	}

	
	public List<Homeowner> getHomeowners() {
		return homeownerDao.findAll();
	}

	
	public Homeowner addHomeowner(Homeowner homeowner) {
		return homeownerDao.save(homeowner);
	}

	
	public List<Property> getProperties() {
		return propertyDao.findAll();
	}

	
	public Property addProperty(Property property) {
		return propertyDao.save(property);
	}

	
	public List<Policy> getPolicies() {
		return policyDao.findAll();
	}

	
	public List<Policy> getPolicies(String username) {
		return policyDao.findByUsername(username);
	}

	
	public Policy addPolicy(Policy policy) {
		return policyDao.save(policy);
	}

	
	public Policy getPolicy(Long quotationId) {
		return policyDao.findByQuotationId(quotationId);
	}
}
