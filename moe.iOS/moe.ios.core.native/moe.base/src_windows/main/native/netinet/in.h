#ifndef NETINET_IN_H
#define NETINET_IN_H

#include <ws2tcpip.h>
#include <ws2ipdef.h>

struct ip_mreqn {
	struct in_addr imr_multiaddr;
	struct in_addr imr_address;
	int imr_ifindex;
};

#endif
