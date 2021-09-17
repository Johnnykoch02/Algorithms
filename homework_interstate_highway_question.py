def is_valid(num):
    return not(num < 0) and not(num>999) and not(int(str(num)[-2:]) == 0)
def get_type(num):
    return 1 if (num <100) else 0

highway_number = int(input())


if is_valid(highway_number):
    i = get_type(highway_number)
    if i == 1:
        if highway_number%2 == 0: # e/w
            print('I-{} is primary, going east/west.'.format(highway_number))
        else: #n/s
            print('I-{} is primary, going north/south.'.format(highway_number))
    else: #auxil
        if highway_number%2 == 0: # e/w
            print('I-{} is auxiliary, serving I-{}, going east/west.'.format(highway_number, int(str(highway_number)[-2:])))
        else: #n/s
            print('I-{} is auxiliary, serving I-{}, going north/south.'.format(highway_number, int(str(highway_number)[-2:])))
else:
    print('{} is not a valid interstate highway number.'.format(highway_number))
    
