struct ip {
#if BYTE_ORDER == LITTLE_ENDIAN
	unsigned int ip_hl:4, ip_v:4;
#else
	unsigned int ip_v:4, ip_hl:4;
#endif
};
