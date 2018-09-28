package com.daos;

import java.util.List;

import com.beans.Security;
import com.beans.User;

public interface SecurityDAO {
	int addSecurity(Security security);
	Security findSecuritybyISIN(String ISIN);
	// TODO: Implement modifyUser
	// int modifySecurity(User user);
	int deleteSecurity(String ISIN);
	List<Security> findAllSecurities();

}
